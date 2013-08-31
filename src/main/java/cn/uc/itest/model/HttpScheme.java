package cn.uc.itest.model;

import java.io.Serializable;

/**
 * @author luozj
 
 * @date 2013-08-31 23:44:27
 */
public class HttpScheme implements Serializable{
    
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
    private String method;
    
    /**
     * 
     */
    private String interfaceId;
    
    public String getId()
    {
        return id;
    }
        
    public void setId(String id)
    {
        this.id = id;
    }
        
    public String getMethod()
    {
        return method;
    }
        
    public void setMethod(String method)
    {
        this.method = method;
    }
        
    public String getInterfaceId()
    {
        return interfaceId;
    }
        
    public void setInterfaceId(String interfaceId)
    {
        this.interfaceId = interfaceId;
    }
        
}
