/*
 * Copyright 2012-2017 the original author or authors.
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bravi.chess.ChessConfiguration;
import com.bravi.chess.domain.Board;

@RestController
@RequestMapping("/config")
public class ConfigController {
	
	private static final Logger log = LoggerFactory.getLogger(ConfigController.class);

	@Autowired
	private ChessConfiguration config;
	
	@PostMapping(path = "/board", produces = MediaType.APPLICATION_JSON_VALUE)
	public Board updateBoard(Integer rows, Integer columns) {
		log.debug("Switching board to [{}, {}]", rows, columns);
		config.setColumns(columns);
		config.setRows(rows);
		return config.getBoard();
	}
	

}
