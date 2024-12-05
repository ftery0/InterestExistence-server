package hj.Interest.Existence.global.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hj.Interest.Existence.global.error.ErrorResponse;
import hj.Interest.Existence.global.error.exception.BusinessException;
import hj.Interest.Existence.global.error.exception.ErrorCodeEnum;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.web.filter.OncePerRequestFilter;


import java.io.IOException;

public class ExceptionHandlerFilter extends OncePerRequestFilter {
    private  final ObjectMapper objectMapper;
    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    )throws IOException {
        try {
            filterChain.doFilter(request,response);
        } catch (BusinessException e){
            ErrorCodeEnum errorCode = e.getErrorCode();
            setErrorResponse(response, ErrorResponse.of(errorCode, errorCode.getMessage()));
        } catch (Exception e){
            setErrorResponse(response, ErrorResponse.of(response.getStatus(),e.getMessage()));
        }
    }
    private void setErrorResponse(HttpServletResponse response, ErrorResponse errorResponse) throws IOException {
        response.setStatus(errorResponse);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding("UTF-8");
        objectMapper.writeValue(response.getWriter(), errorResponse);
    }
}
