package com.miraclesoft.itg.Project.po;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class Poservice {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Map<String, String> insertItems(Po po) {

		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "INSERT INTO Po (POId,CustomerId,PoShipToAddress,PoShipToZip,PoShipToCity,PoShipToState,PoBillToAddress,PoBillToZip,PoBillToCity,PoBillToState,PoStatus) VALUES (:PoID,:CustomerId,:POShipToAddress,:POShiptoZip,:POShiptoCity,:POShiptoState,:POBillToAddress,:POBillToZip,:POBillToCity,:POBillToState,:POStatus)";
		try
		{
			SqlParameterSource parameters = new MapSqlParameterSource() .addValue("POId", po.getPOId())
					.addValue("CustomerId", po.getCustomerId())
					.addValue("PoShipToAddress", po.getPOShipToAddress())
					.addValue("PoShipToZip", po.getPOShiptoZip())
					.addValue("PoShipToCity", po.getPOShiptoCity())
					.addValue("PoShipToState",po.getPOShiptoState())
					
					.addValue("PoBillToAddress", po.getPOBillToAddress())
					.addValue("PoBillToZip",po.getPOBillToZip())
					.addValue("PoBillToCity", po.getPOBillToCity())
					.addValue("PoBillToState", po.getPOBillToState())
					.addValue("PoStatus", po.getPOStatus());

			result = namedParameterJdbcTemplate.update(sql, parameters);
			if (result > 0)
				data.put("success", "Record inserted successfully");
			else
				data.put("failed", "Record failed to insert, please try again!");
		} catch (Exception e) {
			data.put("error", "Error occured, please try again!");
			
		}
		
		return data;

	}
	public Map<String, String> update(Po po) {
		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "update po set CustomerId=?where POId=?";
		try {
			result = jdbcTemplate.update(sql,po.getPOId(),po.getCustomerId(),po.getPOShipToAddress(),po.getPOShiptoZip(),po.getPOShiptoCity(),po.getPOShiptoState(), po.getPOBillToAddress(),po.getPOBillToZip(),po.getPOBillToCity(),po.getPOBillToState(),po.getPOStatus());
			if (result > 0)
				data.put("success", "updated successfully");
			else
				data.put("failed", "updation failed");
		} catch (Exception e) {
			data.put("error", "Error occured, please try again!");
	e.printStackTrace();
		}
		
		return data;
	}

	

	public List get(int id) {
		
		Map dataMap = new HashMap();
		List responseList = new ArrayList();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String sql = "select POId,CustomerId,PoShipToAddress,PoShipToZip,PoShipToCity,PoShipToState,PoBillToAddress,PoBillToZip,PoBillToCity,PoBillToState,PoStatus";
		try {
			dataList = jdbcTemplate.queryForList(sql, id);

			for (Map<String, Object> row : dataList) {
				dataMap.put("PoId", row.get("PoID"));
				dataMap.put("CustomerId", row.get("CustomerId"));
				dataMap.put("PoShipToAddress", row.get("POShipToAddress"));
				dataMap.put("PoShipToZip", row.get("POShipToZip"));
				dataMap.put("PoShipToCity", row.get("POShipToCity"));
				dataMap.put("PoShipToState", row.get("POShipToState"));
				dataMap.put("PoBillToAddress", row.get("POBillToAddress"));
				dataMap.put("PoBillToZip", row.get("POBillToZip"));
				dataMap.put("PoBillToCity", row.get("POBillToCity"));
				dataMap.put("PoBillToState", row.get("POBillToState"));
				dataMap.put("PoStatus", row.get("POStatus"));
				responseList.add(dataList);
			}
		
		} catch (Exception e) {
			dataMap.put("error", "Error occured");
		}
		
	
		return responseList;
	}



	public List getAll() {
		
		Map dataMap = null;
		List responseList = new ArrayList();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String sql = "select * from po";

		try {
			dataList = jdbcTemplate.queryForList(sql);

			for (Map<String, Object> row : dataList) {
				dataMap = new HashMap();
				dataMap.put("POId", row.get("PoID"));
				dataMap.put("CustomerId", row.get("CustomerId"));
				dataMap.put("PoShipToAddress", row.get("POShipToAddress"));
				dataMap.put("PoShipToZip", row.get("POShipToZip"));
				dataMap.put("PoShipToCity", row.get("POShipToCity"));
				dataMap.put("PoShipToState", row.get("POShipToState"));
				dataMap.put("PoBillToAddress", row.get("POBillToAddress"));
				dataMap.put("PoBillToZip", row.get("POBillToZip"));
				dataMap.put("PoBillToCity", row.get("POBillToCity"));
				dataMap.put("PoBillToState", row.get("POBillToState"));
				dataMap.put("PoStatus", row.get("POStatus"));
				
			
				responseList.add(dataMap);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured");

		}
		
		return responseList;
	}
}
	

