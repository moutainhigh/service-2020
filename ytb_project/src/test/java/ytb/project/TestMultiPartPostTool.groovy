/*
package ytb.project

import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.HttpEntity
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils

class TestMultiPartPostTool {

        public static String post1(String url) throws IOException {
            String result="{}";
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            try {
                HttpPost post = new HttpPost(url);
                post.setHeader("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;)");
                post.setHeader("charset", "utf-8");

                String token = "4dc6098e-d584-4883-a4e7-45adc5xxxxxx";
                post.setHeader("Authorization", "Bearer " + token);
                post.setHeader("Accept", "application/json");
                //post.setHeader("Content-Type", "multipart/mixed;boundary=----QWERTYUIO");
                //post.setHeader("Content-Type", "multipart/mixed;boundary=----QWERTYUIO");
                post.setHeader("Content-Type", "multipart/form-data;boundary=----WebKitFormBoundaryAyEwfJHpBOm44uLu");

                String filename=TestMultiPartPost.class.getResource("/testfile/1.jpg").getPath();

                FileBody img1 = new FileBody(new File(filename), ContentType.create("image/jpeg"), "1.jpg");
                FileBody img2 = new FileBody(new File("D:/1.jpg"), ContentType.create("image/jpeg"), "4.jpg");
                StringBody meta = new StringBody("{ \"f1\":\"v1\"; \"f2\":\"v2\"   }", ContentType.APPLICATION_JSON);
                HttpEntity reqEntity = MultipartEntityBuilder.create().
                        addPart("files", img1)
                //.addPart("files", img2)
                        //.addPart("story", meta)
                        .setBoundary("----QWERTYUIO").build();//.addPart("story", meta).build();
                post.setEntity(reqEntity);

String r='''------WebKitFormBoundaryAyEwfJHpBOm44uLu
Content-Disposition: form-data; name="talk"; filename="需求说明书-案例V0.3.xlsx"
Content-Type: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


------WebKitFormBoundaryAyEwfJHpBOm44uLu
Content-Disposition: form-data; name="msgBody"

{163}
------WebKitFormBoundaryAyEwfJHpBOm44uLu--'''
               //ByteArrayEntity ba=new ByteArrayEntity(reqEntity);
               // post.setEntity(ba);

                // System.out.println("executing request " + post.getRequestLine());
                CloseableHttpResponse response = httpClient.execute(post);
                try {
                    System.out.println("----------------------------------------");
                    System.out.println(response.getStatusLine());
                    HttpEntity resEntity = response.getEntity();
                    if (resEntity != null) {
                        result = EntityUtils.toString(resEntity, "UTF-8");
                        System.out.println("Response content: " +result);
                        System.out.println("Response content length: " + resEntity.getContentLength());
                    }
                    EntityUtils.consume(resEntity);

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    response.close();
                }

            } finally {
                httpClient.close();
            }
            return result;

        }

    public static String post(String url) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        //把一个普通参数和文件上传给下面这个地址    是一个servlet
        HttpPost httpPost = new HttpPost(url);
        //把文件转换成流对象FileBody
        File postFile = new File("D:/1.txt");
        File postFile1 = new File("D:/1.jpg");
        FileBody fundFileBin = new FileBody(postFile);
        FileBody fundFileBin1 = new FileBody(postFile1);
        //设置传输参数
        MultipartEntityBuilder multipartEntity = MultipartEntityBuilder.create();
        multipartEntity.addPart("talk", fundFileBin);//相当于<input type="talk" name="media"/>
        multipartEntity.addTextBody("msgBody", "{}");//相当于<input type="talk" name="media"/>
        multipartEntity.addPart(postFile1.getName(), fundFileBin1);//相当于<input type="talk" name="media"/>
        //设计文件以外的参数
       // multipartEntity.addPart("dd", new StringBody("d"), ContentType.create("text/plain", Consts.UTF_8));
        //multipartEntity.add.addTextBody("dd",  "d" , ContentType.create("text/plain", Consts.UTF_8));
        HttpEntity reqEntity = multipartEntity.build();
        httpPost.setEntity(reqEntity);
        //发起请求   并返回请求的响应
        CloseableHttpResponse response = httpClient.execute(httpPost);
        System.out.println(response.getStatusLine());
        HttpEntity resEntity = response.getEntity();
        if (resEntity != null) {
            return EntityUtils.toString(resEntity, "UTF-8");
        }
        return "";
    }

    public static String postText(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //把一个普通参数和文件上传给下面这个地址    是一个servlet
        HttpPost httpPost = new HttpPost(url);
        StringEntity e=new StringEntity("{}")
        httpPost.setEntity(e);
        //发起请求   并返回请求的响应
        CloseableHttpResponse response = httpClient.execute(httpPost);
        System.out.println(response.getStatusLine());
        HttpEntity resEntity = response.getEntity();
        if (resEntity != null) {
            return EntityUtils.toString(resEntity, "UTF-8");
        }
        return "{}";
    }

}
*/
