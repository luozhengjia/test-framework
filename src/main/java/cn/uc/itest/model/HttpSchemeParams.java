package cn.uc.itest.model;

import java.io.Serializable;

/**
 * @author luozj
 
 * @date 2013-08-31 23:44:54
 */
public class HttpSchemeParams implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String id;
    
    /**
     * 
     */
    private String httpSchemeId;
    
    /**
     * 
     */
    private Integer type;
    
    /**
     * 
     */
    private String paramName;
    
    /**
     * 
     */
    private String paramValue;
    
    public String getId()
    {
        return id;
    }
        
    public void setId(String id)
    {
        this.id = id;
    }
        
    public String getHttpSchemeId()
    {
        return httpSchemeId;
    }
        
    public void setHttpSchemeId(String httpSchemeId)
    {
        this.httpSchemeId = httpSchemeId;
    }
        
    public Integer getType()
    {
        return type;
    }
        
    public void setType(Integer type)
    {
        this.type = type;
    }
        
    public String getParamName()
    {
        return paramName;
    }
        
    public void setParamName(String paramName)
    {
        this.paramName = paramName;
    }
        
    public String getParamValue()
    {
        return paramValue;
    }
        
    public void setParamValue(String paramValue)
    {
        this.paramValue = paramValue;
    }
        
}
