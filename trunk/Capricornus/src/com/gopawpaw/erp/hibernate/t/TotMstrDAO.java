package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TotMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TotMstr
 * @author MyEclipse Persistence Tools
 */

public class TotMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TotMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TotMstr transientInstance) {
		log.debug("saving TotMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TotMstr persistentInstance) {
		log.debug("deleting TotMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TotMstr findById(com.gopawpaw.erp.hibernate.t.TotMstrId id) {
		log.debug("getting TotMstr instance with id: " + id);
		try {
			TotMstr instance = (TotMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TotMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TotMstr instance) {
		log.debug("finding TotMstr instance by example");
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
		log.debug("finding TotMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TotMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TotMstr instances");
		try {
			String queryString = "from TotMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TotMstr merge(TotMstr detachedInstance) {
		log.debug("merging TotMstr instance");
		try {
			TotMstr result = (TotMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TotMstr instance) {
		log.debug("attaching dirty TotMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TotMstr instance) {
		log.debug("attaching clean TotMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TotMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TotMstrDAO) ctx.getBean("TotMstrDAO");
	}
}