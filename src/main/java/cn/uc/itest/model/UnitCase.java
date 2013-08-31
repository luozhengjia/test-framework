package cn.uc.itest.model;

import java.io.Serializable;

/**
 * @author luozj
 
 * @date 2013-08-31 23:43:55
 */
public class UnitCase implements Serializable{
    
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
    private String name;
    
    /**
     * 
     */
    private String interfaceId;
    
    /**
     * 
     */
    private Integer matchMode;
    
    /**
     * 
     */
    private String expectValue;
    
    public String getId()
    {
        return id;
    }
        
    public void setId(String id)
    {
        this.id = id;
    }
        
    public String getName()
    {
        return name;
    }
        
    public void setName(String name)
    {
        this.name = name;
    }
        
    public String getInterfaceId()
    {
        return interfaceId;
    }
        
    public void setInterfaceId(String interfaceId)
    {
        this.interfaceId = interfaceId;
    }
        
    public Integer getMatchMode()
    {
        return matchMode;
    }
        
    public void setMatchMode(Integer matchMode)
    {
        this.matchMode = matchMode;
    }
        
    public String getExpectValue()
    {
        return expectValue;
    }
        
    public void setExpectValue(String expectValue)
    {
        this.expectValue = expectValue;
    }
        
}
