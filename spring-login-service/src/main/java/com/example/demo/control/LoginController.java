package com.example.demo.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MayilaiMuthu
 * @since 03-08-2023
 *
 */

@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {
	
	@GetMapping("/health-check")
	public ResponseEntity<String> healthCheck() {
		log.info("CURD Controller : Method Name is => healthCheck()");
		return new ResponseEntity<>("GOOD", HttpStatus.OK);
	}

}
