package com.gopawpaw.erp.hibernate.o;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for OpsCtrl entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.gopawpaw.erp.hibernate.o.OpsCtrl
  * @author MyEclipse Persistence Tools 
 */

public class OpsCtrlDAO extends HibernateDaoSupport  {
    private static final Log log = LogFactory.getLog(OpsCtrlDAO.class);


	protected void initDao() {
		//do nothing
	}
    
    public void save(OpsCtrl transientInstance) {
        log.debug("saving OpsCtrl instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(OpsCtrl persistentInstance) {
        log.debug("deleting OpsCtrl instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public OpsCtrl findById( java.lang.String id) {
        log.debug("getting OpsCtrl instance with id: " + id);
        try {
            OpsCtrl instance = (OpsCtrl) getHibernateTemplate()
                    .get("com.gopawpaw.erp.hibernate.o.OpsCtrl", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(OpsCtrl instance) {
        log.debug("finding OpsCtrl instance by example");
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
      log.debug("finding OpsCtrl instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from OpsCtrl as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all OpsCtrl instances");
		try {
			String queryString = "from OpsCtrl";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public OpsCtrl merge(OpsCtrl detachedInstance) {
        log.debug("merging OpsCtrl instance");
        try {
            OpsCtrl result = (OpsCtrl) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(OpsCtrl instance) {
        log.debug("attaching dirty OpsCtrl instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(OpsCtrl instance) {
        log.debug("attaching clean OpsCtrl instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static OpsCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (OpsCtrlDAO) ctx.getBean("OpsCtrlDAO");
	}
}