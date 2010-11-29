package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IphHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IphHist
 * @author MyEclipse Persistence Tools
 */

public class IphHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IphHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IphHist transientInstance) {
		log.debug("saving IphHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IphHist persistentInstance) {
		log.debug("deleting IphHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IphHist findById(com.gopawpaw.erp.hibernate.i.IphHistId id) {
		log.debug("getting IphHist instance with id: " + id);
		try {
			IphHist instance = (IphHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IphHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IphHist instance) {
		log.debug("finding IphHist instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding IphHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IphHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IphHist instances");
		try {
			String queryString = "from IphHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IphHist merge(IphHist detachedInstance) {
		log.debug("merging IphHist instance");
		try {
			IphHist result = (IphHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IphHist instance) {
		log.debug("attaching dirty IphHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IphHist instance) {
		log.debug("attaching clean IphHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IphHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IphHistDAO) ctx.getBean("IphHistDAO");
	}
}