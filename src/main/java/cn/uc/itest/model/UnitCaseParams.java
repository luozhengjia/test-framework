package cn.uc.itest.model;

import java.io.Serializable;

/**
 * @author luozj
 
 * @date 2013-08-31 23:45:27
 */
public class UnitCaseParams implements Serializable{
    
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
    private String unitCastId;
    
    /**
     * 
     */
    private String paramId;
    
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
        
    public String getUnitCastId()
    {
        return unitCastId;
    }
        
    public void setUnitCastId(String unitCastId)
    {
        this.unitCastId = unitCastId;
    }
        
    public String getParamId()
    {
        return paramId;
    }
        
    public void setParamId(String paramId)
    {
        this.paramId = paramId;
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
