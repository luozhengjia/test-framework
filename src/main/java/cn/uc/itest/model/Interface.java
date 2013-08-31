package cn.uc.itest.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luozj
 
 * @date 2013-08-31 23:43:25
 */
public class Interface implements Serializable{
    
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
    private String applicationId;
    
    /**
     * 
     */
    private String title;
    
    /**
     * 
     */
    private String url;
    
    /**
     * 
     */
    private String protocol;
    
    /**
     * 
     */
    private String dbUrl;
    
    /**
     * 
     */
    private String dbDriver;
    
    /**
     * 
     */
    private String dbUser;
    
    /**
     * 
     */
    private String dbPassword;
    
    /**
     * 
     */
    private String setupScript;
    
    /**
     * 
     */
    private String teardownScript;
    
    /**
     * 
     */
    private String description;
    
    /**
     * 
     */
    private Date createTime;
    
    /**
     * 
     */
    private Date updateTime;
    
    public String getId()
    {
        return id;
    }
        
    public void setId(String id)
    {
        this.id = id;
    }
        
    public String getApplicationId()
    {
        return applicationId;
    }
        
    public void setApplicationId(String applicationId)
    {
        this.applicationId = applicationId;
    }
        
    public String getTitle()
    {
        return title;
    }
        
    public void setTitle(String title)
    {
        this.title = title;
    }
        
    public String getUrl()
    {
        return url;
    }
        
    public void setUrl(String url)
    {
        this.url = url;
    }
        
    public String getProtocol()
    {
        return protocol;
    }
        
    public void setProtocol(String protocol)
    {
        this.protocol = protocol;
    }
        
    public String getDbUrl()
    {
        return dbUrl;
    }
        
    public void setDbUrl(String dbUrl)
    {
        this.dbUrl = dbUrl;
    }
        
    public String getDbDriver()
    {
        return dbDriver;
    }
        
    public void setDbDriver(String dbDriver)
    {
        this.dbDriver = dbDriver;
    }
        
    public String getDbUser()
    {
        return dbUser;
    }
        
    public void setDbUser(String dbUser)
    {
        this.dbUser = dbUser;
    }
        
    public String getDbPassword()
    {
        return dbPassword;
    }
        
    public void setDbPassword(String dbPassword)
    {
        this.dbPassword = dbPassword;
    }
        
    public String getSetupScript()
    {
        return setupScript;
    }
        
    public void setSetupScript(String setupScript)
    {
        this.setupScript = setupScript;
    }
        
    public String getTeardownScript()
    {
        return teardownScript;
    }
        
    public void setTeardownScript(String teardownScript)
    {
        this.teardownScript = teardownScript;
    }
        
    public String getDescription()
    {
        return description;
    }
        
    public void setDescription(String description)
    {
        this.description = description;
    }
        
    public Date getCreateTime()
    {
        return createTime;
    }
        
    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
        
    public Date getUpdateTime()
    {
        return updateTime;
    }
        
    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }
        
}
