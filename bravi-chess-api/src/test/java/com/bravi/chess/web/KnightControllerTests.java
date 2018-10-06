/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bravi.chess.web;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class KnightControllerTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGetKnightPossibleMovesA1() {
		String url = "/knight/possible-moves?position=A1";
		ResponseEntity<String> entity = this.restTemplate.getForEntity(url, String.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).contains("[\"A1\",\"A3\",\"A5\",\"B3\",\"B4\",\"C1\",\"C2\",\"C5\",\"D2\",\"D4\",\"E1\",\"E3\"]");
	}
	
	@Test
	public void testGetKnightPossibleMovesH8() {
		String url = "/knight/possible-moves?position=H8";
		ResponseEntity<String> entity = this.restTemplate.getForEntity(url, String.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).contains("[\"D6\",\"D8\",\"E5\",\"E7\",\"F4\",\"F7\",\"F8\",\"G5\",\"G6\",\"H4\",\"H6\",\"H8\"]");
	}

}
