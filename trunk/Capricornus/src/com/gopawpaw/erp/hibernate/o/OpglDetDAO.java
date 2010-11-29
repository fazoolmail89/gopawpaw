package com.gopawpaw.erp.hibernate.o;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 	* A data access object (DAO) providing persistence and search support for OpglDet entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.gopawpaw.erp.hibernate.o.OpglDet
  * @author MyEclipse Persistence Tools 
 */

public class OpglDetDAO extends HibernateDaoSupport  {
    private static final Log log = LogFactory.getLog(OpglDetDAO.class);


	protected void initDao() {
		//do nothing
	}
    
    public void save(OpglDet transientInstance) {
        log.debug("saving OpglDet instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(OpglDet persistentInstance) {
        log.debug("deleting OpglDet instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public OpglDet findById( com.gopawpaw.erp.hibernate.o.OpglDetId id) {
        log.debug("getting OpglDet instance with id: " + id);
        try {
            OpglDet instance = (OpglDet) getHibernateTemplate()
                    .get("com.gopawpaw.erp.hibernate.o.OpglDet", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(OpglDet instance) {
        log.debug("finding OpglDet instance by example");
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
      log.debug("finding OpglDet instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from OpglDet as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all OpglDet instances");
		try {
			String queryString = "from OpglDet";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public OpglDet merge(OpglDet detachedInstance) {
        log.debug("merging OpglDet instance");
        try {
            OpglDet result = (OpglDet) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(OpglDet instance) {
        log.debug("attaching dirty OpglDet instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(OpglDet instance) {
        log.debug("attaching clean OpglDet instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static OpglDetDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (OpglDetDAO) ctx.getBean("OpglDetDAO");
	}
}