package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TxzMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TxzMstr
 * @author MyEclipse Persistence Tools
 */

public class TxzMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TxzMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TxzMstr transientInstance) {
		log.debug("saving TxzMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TxzMstr persistentInstance) {
		log.debug("deleting TxzMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TxzMstr findById(com.gopawpaw.erp.hibernate.t.TxzMstrId id) {
		log.debug("getting TxzMstr instance with id: " + id);
		try {
			TxzMstr instance = (TxzMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TxzMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TxzMstr instance) {
		log.debug("finding TxzMstr instance by example");
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
		log.debug("finding TxzMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TxzMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TxzMstr instances");
		try {
			String queryString = "from TxzMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TxzMstr merge(TxzMstr detachedInstance) {
		log.debug("merging TxzMstr instance");
		try {
			TxzMstr result = (TxzMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TxzMstr instance) {
		log.debug("attaching dirty TxzMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TxzMstr instance) {
		log.debug("attaching clean TxzMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TxzMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TxzMstrDAO) ctx.getBean("TxzMstrDAO");
	}
}