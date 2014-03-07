/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.gettrello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author FGT
 */
public class HTTP{
    
    String url;

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @param url
     */
    public HTTP(String url) {
        this.url = url;
    }
    
    /**
     *
     * @return
     * @throws IOException
     */
    public String getResult() throws IOException{
        HttpClient client =  new DefaultHttpClient();
        HttpGet request =  new HttpGet(url);
        try {
            HttpResponse response = client.execute(request);
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = rd.readLine();
            return line;
        } catch (Exception e) {
            return "Error: No se pudo conectar a URL";
        }       
    }
    
}
