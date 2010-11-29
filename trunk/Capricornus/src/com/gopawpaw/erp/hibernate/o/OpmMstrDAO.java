package com.gopawpaw.erp.hibernate.o;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for OpmMstr entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.gopawpaw.erp.hibernate.o.OpmMstr
  * @author MyEclipse Persistence Tools 
 */

public class OpmMstrDAO extends HibernateDaoSupport  {
    private static final Log log = LogFactory.getLog(OpmMstrDAO.class);


	protected void initDao() {
		//do nothing
	}
    
    public void save(OpmMstr transientInstance) {
        log.debug("saving OpmMstr instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(OpmMstr persistentInstance) {
        log.debug("deleting OpmMstr instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public OpmMstr findById( com.gopawpaw.erp.hibernate.o.OpmMstrId id) {
        log.debug("getting OpmMstr instance with id: " + id);
        try {
            OpmMstr instance = (OpmMstr) getHibernateTemplate()
                    .get("com.gopawpaw.erp.hibernate.o.OpmMstr", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(OpmMstr instance) {
        log.debug("finding OpmMstr instance by example");
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
      log.debug("finding OpmMstr instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from OpmMstr as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all OpmMstr instances");
		try {
			String queryString = "from OpmMstr";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public OpmMstr merge(OpmMstr detachedInstance) {
        log.debug("merging OpmMstr instance");
        try {
            OpmMstr result = (OpmMstr) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(OpmMstr instance) {
        log.debug("attaching dirty OpmMstr instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(OpmMstr instance) {
        log.debug("attaching clean OpmMstr instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static OpmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (OpmMstrDAO) ctx.getBean("OpmMstrDAO");
	}
}