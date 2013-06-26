package com.bbw.scanme.utils;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.bbw.scanme.pojo.FileBean;

public class JsonUtils {
	/**
	 * ��ȡ��ά��洢����Ϣ ��ת��Ϊ���ض���
	 * @param json
	 * @return
	 */
	public static List<FileBean> convertJson2Bean(String json) {
		List<FileBean> beans = new ArrayList<FileBean>();
		try {
			JSONArray arrays = new JSONArray(json);
			for (int i = 0; i < arrays.length(); i++) {
				JSONObject jsonObject = arrays.getJSONObject(i);
				String name = jsonObject.getString("name");
				String type = jsonObject.getString("type");
				String url = jsonObject.getString("url");
				beans.add(new FileBean(name, type, url));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return beans;
	}
}
