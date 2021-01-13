package com.miraclesoft.itg.Project.PO_Items;
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
public class PO_Itemsservice {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Map<String, String> insertItems(PO_Itemstable po_items) {

		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "INSERT INTO PO_Itemstable (POID,ItemsID,Qty,Price,Discount) VALUES (:POID,:ITEMSID,:QTY,:Price,Discount)";
		try
		{
			SqlParameterSource parameters = new MapSqlParameterSource() .addValue("POID", po_items.getPOID())
					.addValue("ItemsID", po_items.getItemsID())
					.addValue("Qty",po_items.getQty())
					.addValue("Price",po_items.getPrice())
					.addValue("Discount", po_items.getDiscount());
			

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
	public Map<String, String> update(PO_Itemstable po_items) {
		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "update PO_Itemstable set Price=?where Qty=?";
		try {
			result = jdbcTemplate.update(sql,po_items.getPOID(),po_items.getQty(),po_items.getPrice(), po_items.getDiscount());
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
		String sql = "select ItemsID,Qty,Price,Discount where POID = ?";
		try {
			dataList = jdbcTemplate.queryForList(sql, id);

			for (Map<String, Object> row : dataList) {
				dataMap.put("POID", row.get("POID"));
				dataMap.put("ItemsID", row.get("ItemsID"));
				dataMap.put("Qty", row.get("Qty"));
				dataMap.put("Price", row.get("Price"));
				dataMap.put("Discount", row.get("Discount"));
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
		String sql = "select * from  PO_Itemstable";

		try {
			dataList = jdbcTemplate.queryForList(sql);

			for (Map<String, Object> row : dataList) {
				dataMap = new HashMap();
				dataMap.put("POID", row.get("POID"));
				dataMap.put("ItemsID", row.get("ItemsID"));
				dataMap.put("Qty", row.get("Qty"));
				dataMap.put("Price", row.get("Price"));
				dataMap.put("Discount", row.get("Discount"));
			
				responseList.add(dataMap);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured");

		}
		
		return responseList;
	}

}