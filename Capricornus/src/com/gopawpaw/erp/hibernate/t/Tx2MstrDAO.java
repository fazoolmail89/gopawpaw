package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tx2Mstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.Tx2Mstr
 * @author MyEclipse Persistence Tools
 */

public class Tx2MstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Tx2MstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Tx2Mstr transientInstance) {
		log.debug("saving Tx2Mstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tx2Mstr persistentInstance) {
		log.debug("deleting Tx2Mstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tx2Mstr findById(com.gopawpaw.erp.hibernate.t.Tx2MstrId id) {
		log.debug("getting Tx2Mstr instance with id: " + id);
		try {
			Tx2Mstr instance = (Tx2Mstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.Tx2Mstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tx2Mstr instance) {
		log.debug("finding Tx2Mstr instance by example");
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
		log.debug("finding Tx2Mstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tx2Mstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Tx2Mstr instances");
		try {
			String queryString = "from Tx2Mstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tx2Mstr merge(Tx2Mstr detachedInstance) {
		log.debug("merging Tx2Mstr instance");
		try {
			Tx2Mstr result = (Tx2Mstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tx2Mstr instance) {
		log.debug("attaching dirty Tx2Mstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tx2Mstr instance) {
		log.debug("attaching clean Tx2Mstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Tx2MstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Tx2MstrDAO) ctx.getBean("Tx2MstrDAO");
	}
}