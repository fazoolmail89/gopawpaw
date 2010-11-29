package com.gopawpaw.erp.hibernate.n;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for NrhHist entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.gopawpaw.erp.hibernate.n.NrhHist
  * @author MyEclipse Persistence Tools 
 */

public class NrhHistDAO extends HibernateDaoSupport  {
    private static final Log log = LogFactory.getLog(NrhHistDAO.class);


	protected void initDao() {
		//do nothing
	}
    
    public void save(NrhHist transientInstance) {
        log.debug("saving NrhHist instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(NrhHist persistentInstance) {
        log.debug("deleting NrhHist instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public NrhHist findById( com.gopawpaw.erp.hibernate.n.NrhHistId id) {
        log.debug("getting NrhHist instance with id: " + id);
        try {
            NrhHist instance = (NrhHist) getHibernateTemplate()
                    .get("com.gopawpaw.erp.hibernate.n.NrhHist", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(NrhHist instance) {
        log.debug("finding NrhHist instance by example");
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
      log.debug("finding NrhHist instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from NrhHist as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all NrhHist instances");
		try {
			String queryString = "from NrhHist";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public NrhHist merge(NrhHist detachedInstance) {
        log.debug("merging NrhHist instance");
        try {
            NrhHist result = (NrhHist) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(NrhHist instance) {
        log.debug("attaching dirty NrhHist instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(NrhHist instance) {
        log.debug("attaching clean NrhHist instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static NrhHistDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (NrhHistDAO) ctx.getBean("NrhHistDAO");
	}
}