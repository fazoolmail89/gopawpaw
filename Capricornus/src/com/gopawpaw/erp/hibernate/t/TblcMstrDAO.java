package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TblcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TblcMstr
 * @author MyEclipse Persistence Tools
 */

public class TblcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TblcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TblcMstr transientInstance) {
		log.debug("saving TblcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TblcMstr persistentInstance) {
		log.debug("deleting TblcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TblcMstr findById(com.gopawpaw.erp.hibernate.t.TblcMstrId id) {
		log.debug("getting TblcMstr instance with id: " + id);
		try {
			TblcMstr instance = (TblcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TblcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TblcMstr instance) {
		log.debug("finding TblcMstr instance by example");
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
		log.debug("finding TblcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TblcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TblcMstr instances");
		try {
			String queryString = "from TblcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TblcMstr merge(TblcMstr detachedInstance) {
		log.debug("merging TblcMstr instance");
		try {
			TblcMstr result = (TblcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TblcMstr instance) {
		log.debug("attaching dirty TblcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TblcMstr instance) {
		log.debug("attaching clean TblcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TblcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TblcMstrDAO) ctx.getBean("TblcMstrDAO");
	}
}