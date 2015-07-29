package com.scework.spi.rest.common;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.view.BaseSupportController;

@Controller
@RequestMapping("/")
public class FileUploadAndDownloadController extends BaseSupportController {
	/**
	 * FileUploadAndDownloadController.java[long] serialVersionUID
	 * 
	 * @since V1.0
	 */
	private static final long serialVersionUID = 436825675420797571L;

	@RequestMapping(value = "/download/{fileName}/{pref}")
	public String downloadFile(@PathVariable String fileName,@PathVariable String pref,
			HttpServletResponse response) {
		String path = "C:\\Tony\\"+fileName+"."+pref;
		System.out.println(path);
		File file = new File(path);
		FileInputStream fis = null;
		BufferedInputStream buff = null;
		OutputStream myout = null;
		boolean isOnLine = false;
		try {
			if (!file.exists()) {
				response.sendError(404, "File not found!");
				return "";
			}
			response.reset();
			// 设置response的编码方式
//			response.setContentType("application/pdf");
			response.setContentType("video/avi");
			// 写明要下载的文件的大小
			response.setContentLength((int) file.length());
			// 设置附加文件名(解决中文乱码)
//			response.setHeader("Content-Disposition",
//					"attachment;filename="
//							+ new String(file.getName().getBytes("utf-8"),
//									"iso-8859-1"));
//			response.setContentType("text/html;charset=utf-8");
			
			fis = new FileInputStream(file);
			buff = new BufferedInputStream(fis);
			byte[] b = new byte[1024];// 相当于我们的缓存
			long k = 0;// 该值用于计算当前实际下载了多少字节
			// 从response对象中得到输出流,准备下载
			myout = response.getOutputStream();
			while (k < file.length()) {
				int j = buff.read(b, 0, 1024);
				k += j;
				// 将b中的数据写到客户端的内存
				myout.write(b, 0, j);
			}
			// 将写入到客户端的内存的数据,刷新到磁盘
			myout.flush();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (buff != null)
					buff.close();
				if (myout != null)
					myout.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
