package br.com.wfcreations.annms.core.transport.message;

import java.util.LinkedHashMap;
import java.util.Map;

public class InsertIntoResultMesssage extends ResultMessage {

	private final int affected;

	public InsertIntoResultMesssage(int affected) {
		this.affected = affected;
	}

	@Override
	public Object toThriftResult() {
		Map<String, Object> param = new LinkedHashMap<String, Object>();
		param.put("AFFECTED", String.valueOf(affected));
		return param;
	}

	@Override
	public String getType() {
		return "INSERT INTO";
	}

}
