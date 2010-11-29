package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BkfmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BkfmMstr
 * @author MyEclipse Persistence Tools
 */

public class BkfmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BkfmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BkfmMstr transientInstance) {
		log.debug("saving BkfmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BkfmMstr persistentInstance) {
		log.debug("deleting BkfmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BkfmMstr findById(com.gopawpaw.erp.hibernate.b.BkfmMstrId id) {
		log.debug("getting BkfmMstr instance with id: " + id);
		try {
			BkfmMstr instance = (BkfmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BkfmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BkfmMstr instance) {
		log.debug("finding BkfmMstr instance by example");
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
		log.debug("finding BkfmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BkfmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BkfmMstr instances");
		try {
			String queryString = "from BkfmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BkfmMstr merge(BkfmMstr detachedInstance) {
		log.debug("merging BkfmMstr instance");
		try {
			BkfmMstr result = (BkfmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BkfmMstr instance) {
		log.debug("attaching dirty BkfmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BkfmMstr instance) {
		log.debug("attaching clean BkfmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BkfmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BkfmMstrDAO) ctx.getBean("BkfmMstrDAO");
	}
}