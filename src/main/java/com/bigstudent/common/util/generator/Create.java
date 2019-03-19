package com.bigstudent.common.util.generator;


public class Create {
	public static void main(String[] args) {
		Create ot=new Create();
		ot.test();
	}
	
	public void test(){

		// 数据库连接信息
		String url = "jdbc:mysql://47.96.118.93:3306/big_student?useUnicode=true&characterEncoding=utf8";
		String MysqlUser = "root";
		String mysqlPassword = "chen1208";
		
		// 数据库及数据表名称
		String database = "big_student";

		String table = "bs_article_place";

		// 配置作者及Domain说明.
		String classAuthor = "chenqingsong";
		String functionName = "文章地区表";
		// 公共包路径 (例如 BaseDao、 BaseService、 BaseServiceImpl)
		String commonName ="";
		
		String packageName ="com.bigstudent";
		String moduleName = "";

		//Mapper文件存储地址  默认在resources中
		String batisName = "config/mapping";
		String db="mysql";
		
		try {
			String classNamePrefix = getClassName(table);
			MybatisGenerate.generateCode(db,url, MysqlUser, mysqlPassword, database, table,commonName,packageName,batisName,moduleName,classAuthor,functionName,classNamePrefix);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String getClassName(String tableName) {
	    String beanName = tableName.substring(0,1).toUpperCase() + tableName.substring(1);
	    while(beanName.indexOf("_") >=0){
	        int firstSpe = beanName.indexOf("_");
	        beanName = beanName.substring(0,firstSpe) + beanName.substring(firstSpe+1,firstSpe+2).toUpperCase() + beanName.substring(firstSpe+2);
	    }
		return beanName;
	}
	

}
