package com.bigstudent.common.page;


/**
 * 
 *@类描述：Paginable
 *@author 陈金虎 2016年7月11日 下午6:10:33
 *@注意：本内容仅限于浙江阿拉丁电子商务股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Page<T> implements Paginable<T> {


    private static final long serialVersionUID = 8933698230226183372L;

	public static final int   DEFAULT_PAGE_SIZE = 15;                  // 默认每页记录数

    public static final int   PAGE_COUNT        = 10;

    protected int               pageNo            = 1;                   // 页码

    private int               pageSize          = DEFAULT_PAGE_SIZE;   // 每页记录数

    private int               totalCount        = 0;                   // 总记录数

    private int               totalPage         = 0;                   // 总页数
    
    private String 			  timestamp 		= null;                // 查询时间戳

    private boolean 		  full				= true;				   // 是否全量更新 
    
    private boolean			  isPage		    = true;				   // 是否分页
	private String            sortField;                               //排序字段
	private String            sortValue;                               //排序值 asc/desc
	
	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortValue() {
		return sortValue;
	}

	public void setSortValue(String sortValue) {
		this.sortValue = sortValue;
	}
    
    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        this.setTotalPage(totalPage);
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public boolean isFirstPage() {
        return pageNo <= 1;
    }

    @Override
    public boolean isLastPage() {
        return pageNo >= totalPage;
    }

    @Override
    public int getNextPage() {
        return isLastPage() ? pageNo : (pageNo + 1);
    }

    @Override
    public int getPrePage() {
        return isFirstPage() ? pageNo : (pageNo - 1);
    }

    @Override
    public int getBeginIndex() {
        if (pageNo > 0) {
            return (pageSize * (pageNo - 1));
        } else {
            return 0;
        }
    }

    @Override
    public int getEndIndex() {
        if (pageNo > 0) {
            return Math.min(pageSize * pageNo, totalCount);
        } else {
            return 0;
        }
    }

    public int getBeginPage() {
        if (pageNo > 0) {
            return (PAGE_COUNT * ((pageNo - 1) / PAGE_COUNT)) + 1;
        } else {
            return 0;
        }
    }

    public int getEndPage() {
        if (pageNo > 0) {
            return Math.min(PAGE_COUNT * ((pageNo - 1) / PAGE_COUNT + 1), getTotalPage());
        } else {
            return 0;
        }
    }

	public boolean isFull()
	{
		return full;
	}

	public void setFull(boolean full)
	{
		this.full = full;
	}

	public String getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(String timestamp)
	{
		this.timestamp = timestamp;
	}

	public boolean isPage() {
		return isPage;
	}

	public void setIsPage(boolean isPage) {
		this.isPage = isPage;
	}
	
}
