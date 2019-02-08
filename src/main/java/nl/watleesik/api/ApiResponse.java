package nl.watleesik.api;

import lombok.Data;

@Data
public class ApiResponse<T> {

    private int status;
    private String message;
    private T result;
    
	public ApiResponse(int status, String message, T result) {
		this.status = status;
		this.message = message;
		this.result = result;
	}


}
