package com.scheduled;

import java.io.IOException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoService {
	private static final Logger log = LoggerFactory
			.getLogger(DemoService.class);

	@Scheduled(fixedDelay = 9000)
	// @Scheduled(fixedRate = 5000)
	public void demoServiceMethod() {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = null;
		ResponseEntity<String> response = (ResponseEntity<String>) restTemplate
				.getForEntity("http://gturnquist-quoters.cfapps.io/api/random",
						String.class);
		ObjectMapper mapper = new ObjectMapper();
		try {
			quote = mapper.readValue(response.getBody(), Quote.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("++++++++++++++++++++++++++++++");
		log.info("Method executed at every 5 seconds. Current time is :: " + new Date());
		log.info(quote.getValue().getId() + " ::: " + quote.getValue().getQuote());
		log.info("++++++++++++++++++++++++++++++");
	}
}
