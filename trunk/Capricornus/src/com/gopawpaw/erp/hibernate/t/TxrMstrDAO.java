package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TxrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TxrMstr
 * @author MyEclipse Persistence Tools
 */

public class TxrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TxrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TxrMstr transientInstance) {
		log.debug("saving TxrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TxrMstr persistentInstance) {
		log.debug("deleting TxrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TxrMstr findById(com.gopawpaw.erp.hibernate.t.TxrMstrId id) {
		log.debug("getting TxrMstr instance with id: " + id);
		try {
			TxrMstr instance = (TxrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TxrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TxrMstr instance) {
		log.debug("finding TxrMstr instance by example");
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
		log.debug("finding TxrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TxrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TxrMstr instances");
		try {
			String queryString = "from TxrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TxrMstr merge(TxrMstr detachedInstance) {
		log.debug("merging TxrMstr instance");
		try {
			TxrMstr result = (TxrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TxrMstr instance) {
		log.debug("attaching dirty TxrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TxrMstr instance) {
		log.debug("attaching clean TxrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TxrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TxrMstrDAO) ctx.getBean("TxrMstrDAO");
	}
}