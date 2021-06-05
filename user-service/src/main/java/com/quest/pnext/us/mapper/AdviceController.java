package com.quest.pnext.us.mapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.quest.pnext.us.dto.ResponseDTO;

@RestControllerAdvice
public class AdviceController {

	Logger logger = LogManager.getLogger(AdviceController.class);

	@ExceptionHandler({Exception.class })
	public final ResponseEntity<ResponseDTO> handleException(Exception ex, WebRequest request) {
		logger.error(ex.getMessage(), ex);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO("Something went wrong.", ex),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
