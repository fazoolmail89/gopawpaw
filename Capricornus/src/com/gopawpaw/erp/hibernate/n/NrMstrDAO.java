package com.gopawpaw.erp.hibernate.n;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for NrMstr entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.gopawpaw.erp.hibernate.n.NrMstr
  * @author MyEclipse Persistence Tools 
 */

public class NrMstrDAO extends HibernateDaoSupport  {
    private static final Log log = LogFactory.getLog(NrMstrDAO.class);


	protected void initDao() {
		//do nothing
	}
    
    public void save(NrMstr transientInstance) {
        log.debug("saving NrMstr instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(NrMstr persistentInstance) {
        log.debug("deleting NrMstr instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public NrMstr findById( com.gopawpaw.erp.hibernate.n.NrMstrId id) {
        log.debug("getting NrMstr instance with id: " + id);
        try {
            NrMstr instance = (NrMstr) getHibernateTemplate()
                    .get("com.gopawpaw.erp.hibernate.n.NrMstr", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(NrMstr instance) {
        log.debug("finding NrMstr instance by example");
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
      log.debug("finding NrMstr instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from NrMstr as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all NrMstr instances");
		try {
			String queryString = "from NrMstr";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public NrMstr merge(NrMstr detachedInstance) {
        log.debug("merging NrMstr instance");
        try {
            NrMstr result = (NrMstr) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(NrMstr instance) {
        log.debug("attaching dirty NrMstr instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(NrMstr instance) {
        log.debug("attaching clean NrMstr instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static NrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (NrMstrDAO) ctx.getBean("NrMstrDAO");
	}
}