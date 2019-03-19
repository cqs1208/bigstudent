package com.bigstudent.common.util;

import com.bigstudent.domain.BsArticleDo;

/**
 * @author chenqingsong
 * @Description:
 * @Copyright (c) 浙江阿拉丁电子商务股份有限公司
 * @date 2019/3/9
 */
public class CheckImageUtil {

    public static Object checkImageByObject(Object obj){
        if(obj instanceof BsArticleDo){
            BsArticleDo obj1 = (BsArticleDo) obj;
            ((BsArticleDo) obj).setArticleImage(obj1.getArticleImage());
            ((BsArticleDo) obj).setArticlePosters(obj1.getArticlePosters());
        }
        return obj;
    }
}
