package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MphHist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MphHist
 * @author MyEclipse Persistence Tools
 */

public class MphHistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MphHistDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MphHist transientInstance) {
		log.debug("saving MphHist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MphHist persistentInstance) {
		log.debug("deleting MphHist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MphHist findById(com.gopawpaw.erp.hibernate.m.MphHistId id) {
		log.debug("getting MphHist instance with id: " + id);
		try {
			MphHist instance = (MphHist) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MphHist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MphHist instance) {
		log.debug("finding MphHist instance by example");
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
		log.debug("finding MphHist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MphHist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MphHist instances");
		try {
			String queryString = "from MphHist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MphHist merge(MphHist detachedInstance) {
		log.debug("merging MphHist instance");
		try {
			MphHist result = (MphHist) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MphHist instance) {
		log.debug("attaching dirty MphHist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MphHist instance) {
		log.debug("attaching clean MphHist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MphHistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MphHistDAO) ctx.getBean("MphHistDAO");
	}
}