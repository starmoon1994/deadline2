package tools.screenshot;

import java.io.*;

/**
 * HTML页面截屏工具类
 */
public class HtmlScreenShotUtil {

    /**
     * 网页截屏，并保存图片
     *
     * @param url    页面地址
     * @param output 保存图片名(不带后缀)
     */
   /* public static String screenShot(String url, String output) {

        String outPutPath = DK_PHANTOMJS_OUTPUTPATH + output;

        Runtime rt = Runtime.getRuntime();
        StringBuilder sb = new StringBuilder();
        try {
            String cmd = DK_PHANTOMJS_SHELLPATH + " " + DK_PHANTOMJS_JSPATH + " " + url + " " + outPutPath;
            Process process = rt.exec(cmd);
            InputStream is = process.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String tmp = "";
            try {
                while ((tmp = br.readLine()) != null) {
                    sb.append(tmp);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }*/


}
