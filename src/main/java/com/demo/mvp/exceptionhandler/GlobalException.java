package com.demo.mvp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.demo.mvp.response.payload.ResponseModel;

@ControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseModel GlobalExceptionHandler()
	{
		return new ResponseModel(1, HttpStatus.BAD_REQUEST);
	}
	
}
