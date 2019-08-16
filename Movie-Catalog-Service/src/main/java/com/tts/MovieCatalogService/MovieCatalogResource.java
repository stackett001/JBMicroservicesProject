package com.tts.MovieCatalogService;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogResource {
	
	public List<CatalogItem>getCatalog(String userId) {
		return Collections.singletonList(
				new CatalogItem(name: "Transformers", desc: "Test", rating: 4));
	}

}
