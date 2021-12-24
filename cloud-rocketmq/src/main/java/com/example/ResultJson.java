package com.example;



/**
 *
 * 返回前端页面实体
 * @param <T>
 */

public class ResultJson<T> {

	private Boolean state = true;

	private String message;

	private T result;

	private Integer code = 200;

	private Integer total;

	public ResultJson() {
		super();
	}

	public ResultJson(String msg) {
		this.message = msg;
	}

	public ResultJson(Boolean state, String message) {
		super();
		this.state = state;
		this.message = message;
	}

	public ResultJson(boolean state, T result) {
		this.state = state;
		this.result = result;
	}

	public ResultJson(boolean state, Integer code, T result) {
		this.state = state;
		this.result = result;
		this.code = code;
	}

	public ResultJson(boolean state, Integer code, String message) {
		this.state = state;
		this.message = message;
		this.code = code;
	}

	public ResultJson(boolean state, T result, String message) {
		this.state = state;
		this.result = result;
		this.message = message;
	}

	public ResultJson(boolean state, Integer code, T result, String message) {
		this.state = state;
		this.result = result;
		this.message = message;
		this.code = code;
	}

	public ResultJson(boolean state, int code, String description, T t) {
		this.state = state;
		this.result = t;
		this.message = description;
		this.code = code;
	}

	public ResultJson(boolean state, int code, String description, T t, int total){
		this.state = state;
		this.result = t;
		this.message = description;
		this.code = code;
		this.total = total;
	}

	public static ResultJson fail(String message){
		return new ResultJson(false, 500, message);
	}


	public static ResultJson fail(Integer code, String message){
		return new ResultJson(false, code, message);
	}


	public static ResultJson success(Integer code, String message){
		return new ResultJson(true, code, message);
	}

	public static <T> ResultJson<T> success(T t) {
		return new ResultJson<>(true, 200, "操作成功", t);
	}




	public boolean isState() {
		return state;
	}
	public ResultJson setState(boolean state) {
		this.state = state;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public ResultJson setMessage(String message) {
		this.message = message;
		return this;
	}
	public ResultJson setResult(T result) {
		this.result = result;
		return this;
	}

	public int getCode() {
		return code;
	}
	public ResultJson setCode(int code) {
		this.code = code;
		return this;
	}

	public Boolean getState() {
		return state;
	}

	public ResultJson setState(Boolean state) {
		this.state = state;
		return this;
	}

	public T getResult() {
		return result;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setTotal(Integer total){
		this.total = total;
	}

	public Integer getTotal(){
		return total;
	}
}
