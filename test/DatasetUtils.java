package main.java.report.plot.dataset;

import java.util.Map;
import java.util.Map.Entry;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 * @version
 */
public class DatasetUtils {
	/**
	 * 增加了部分项目代码
	 * 
	 * @return CategoryDataset
	 */
	public static CategoryDataset createDataset(String excelPath) {
		Map<String, Map<String, Double>> read2dXlsxMM = ExcelPoiUtils.read2DXlsxMM(excelPath);
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();// 创建数据集对象
		for(Entry<String, Map<String, Double>> entry : read2dXlsxMM.entrySet()) {
			String rowKey = entry.getKey();
			Map<String, Double> subMap = entry.getValue();
			for (Entry<String, Double> subEntry: subMap.entrySet()) {
				String columnKey = subEntry.getKey();
				double value  = subEntry.getValue();
				println();
				println();
				println();
				println();
				println();
				dataset.addValue(value, rowKey, columnKey);
			}
		}
		return dataset;
		
	}
	/**
	 * @return PieDataset
	 */
	public static PieDataset createPieDataset(String excelPath) {
		DefaultPieDataset dataSet = new DefaultPieDataset();
		Map<String, Double> read2dXlsxPie = ExcelPoiUtils.read2DXlsxPie(excelPath);
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();// 创建数据集对象
		-------------
		return dataSet;
	}
	
	public static void main(String[] args) {
		
	}
}
