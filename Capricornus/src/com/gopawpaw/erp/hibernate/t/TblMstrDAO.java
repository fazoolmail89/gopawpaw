package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TblMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TblMstr
 * @author MyEclipse Persistence Tools
 */

public class TblMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TblMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TblMstr transientInstance) {
		log.debug("saving TblMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TblMstr persistentInstance) {
		log.debug("deleting TblMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TblMstr findById(com.gopawpaw.erp.hibernate.t.TblMstrId id) {
		log.debug("getting TblMstr instance with id: " + id);
		try {
			TblMstr instance = (TblMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TblMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TblMstr instance) {
		log.debug("finding TblMstr instance by example");
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
		log.debug("finding TblMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TblMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TblMstr instances");
		try {
			String queryString = "from TblMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TblMstr merge(TblMstr detachedInstance) {
		log.debug("merging TblMstr instance");
		try {
			TblMstr result = (TblMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TblMstr instance) {
		log.debug("attaching dirty TblMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TblMstr instance) {
		log.debug("attaching clean TblMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TblMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TblMstrDAO) ctx.getBean("TblMstrDAO");
	}
}