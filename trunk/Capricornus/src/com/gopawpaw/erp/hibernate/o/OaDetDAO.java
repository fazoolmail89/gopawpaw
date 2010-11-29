package com.gopawpaw.erp.hibernate.o;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for OaDet entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.gopawpaw.erp.hibernate.o.OaDet
  * @author MyEclipse Persistence Tools 
 */

public class OaDetDAO extends HibernateDaoSupport  {
    private static final Log log = LogFactory.getLog(OaDetDAO.class);


	protected void initDao() {
		//do nothing
	}
    
    public void save(OaDet transientInstance) {
        log.debug("saving OaDet instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(OaDet persistentInstance) {
        log.debug("deleting OaDet instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public OaDet findById( com.gopawpaw.erp.hibernate.o.OaDetId id) {
        log.debug("getting OaDet instance with id: " + id);
        try {
            OaDet instance = (OaDet) getHibernateTemplate()
                    .get("com.gopawpaw.erp.hibernate.o.OaDet", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(OaDet instance) {
        log.debug("finding OaDet instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding OaDet instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from OaDet as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all OaDet instances");
		try {
			String queryString = "from OaDet";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public OaDet merge(OaDet detachedInstance) {
        log.debug("merging OaDet instance");
        try {
            OaDet result = (OaDet) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(OaDet instance) {
        log.debug("attaching dirty OaDet instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(OaDet instance) {
        log.debug("attaching clean OaDet instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static OaDetDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (OaDetDAO) ctx.getBean("OaDetDAO");
	}
}