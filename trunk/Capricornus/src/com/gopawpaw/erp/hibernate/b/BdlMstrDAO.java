package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BdlMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BdlMstr
 * @author MyEclipse Persistence Tools
 */

public class BdlMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BdlMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BdlMstr transientInstance) {
		log.debug("saving BdlMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BdlMstr persistentInstance) {
		log.debug("deleting BdlMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BdlMstr findById(com.gopawpaw.erp.hibernate.b.BdlMstrId id) {
		log.debug("getting BdlMstr instance with id: " + id);
		try {
			BdlMstr instance = (BdlMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BdlMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BdlMstr instance) {
		log.debug("finding BdlMstr instance by example");
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
		log.debug("finding BdlMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BdlMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BdlMstr instances");
		try {
			String queryString = "from BdlMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BdlMstr merge(BdlMstr detachedInstance) {
		log.debug("merging BdlMstr instance");
		try {
			BdlMstr result = (BdlMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BdlMstr instance) {
		log.debug("attaching dirty BdlMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BdlMstr instance) {
		log.debug("attaching clean BdlMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BdlMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BdlMstrDAO) ctx.getBean("BdlMstrDAO");
	}
}