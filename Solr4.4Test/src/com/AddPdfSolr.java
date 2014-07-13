package com;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.request.ContentStreamUpdateRequest;
import org.apache.solr.common.util.NamedList;
import org.apache.solr.handler.extraction.ExtractingParams;

public class AddPdfSolr {
	public static void main(String[] args) throws IOException, SolrServerException {
	        try{
		SolrServer server = new HttpSolrServer("http://localhost:8081/solr");
		ContentStreamUpdateRequest req = new ContentStreamUpdateRequest("/update/extract");
		
		//Here file contains the data as document structure with field type otherwis show the error
		req.addFile(new File("F:/sample/LucidWorksSearch-v2.5.pdf"), null);
		req.setParam(ExtractingParams.EXTRACT_ONLY, "true");
		NamedList<Object> result = server.request(req);
		System.out.println("Result: " + result);
		server.commit();
		System.out.println("success");
 } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
	finally{
	}
	}
}
