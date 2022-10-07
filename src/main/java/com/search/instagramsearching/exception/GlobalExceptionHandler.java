package com.search.instagramsearching.exception;

import com.search.instagramsearching.dto.response.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.search.instagramsearching.exception.ErrorCode.*;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    protected ResponseEntity<?> resultNotFoundExceptionHandler(ResultNotFoundException exception) {
        logger.error("resultNotFoundExceptionHandler", exception);
        return new ResponseEntity<>(ResponseDto.fail(RESULT_NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    protected ResponseEntity<?> resultExpirationExceptionHandler(ResultExpirationException exception) {
        logger.error("resultExpirationExceptionHandler", exception);
        return new ResponseEntity<>(ResponseDto.fail(RESULT_EXPIRATION), HttpStatus.GONE);
    }

    @ExceptionHandler
    protected ResponseEntity<?> invalidParameterExceptionHandler(InvalidParameterException exception) {
        logger.error("invalidParameterExceptionHandler", exception);
        return new ResponseEntity<>(ResponseDto.fail(INVALID_PARAMETER), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    protected ResponseEntity<?> userNotFoundExceptionHandler(UserNotFoundException exception) {
        logger.error("userNotFoundExceptionHandler", exception);
        return new ResponseEntity<>(ResponseDto.fail(USER_NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    protected ResponseEntity<?> postNotFoundExceptionHandler(PostsNotFoundExceptioin exception) {
        logger.error("postNotFoundExceptionHandler", exception);
        return new ResponseEntity<>(ResponseDto.fail(POST_NOT_FOUND), HttpStatus.NOT_FOUND);
    }
}