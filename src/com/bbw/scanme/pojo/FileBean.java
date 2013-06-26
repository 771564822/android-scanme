package com.bbw.scanme.pojo;

public class FileBean {
	public FileBean(String name, String type, String url) {
		this.name = name;
		this.type = type;
		this.url = url;
	}

	/**
	 * 下载文件名
	 */
	private String name;
	/**
	 * 文件类型
	 */
	private String type;
	/**
	 * 下载路径
	 */
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
