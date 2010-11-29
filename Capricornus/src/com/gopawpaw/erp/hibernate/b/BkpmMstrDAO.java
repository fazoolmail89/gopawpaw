package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BkpmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BkpmMstr
 * @author MyEclipse Persistence Tools
 */

public class BkpmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BkpmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BkpmMstr transientInstance) {
		log.debug("saving BkpmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BkpmMstr persistentInstance) {
		log.debug("deleting BkpmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BkpmMstr findById(com.gopawpaw.erp.hibernate.b.BkpmMstrId id) {
		log.debug("getting BkpmMstr instance with id: " + id);
		try {
			BkpmMstr instance = (BkpmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BkpmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BkpmMstr instance) {
		log.debug("finding BkpmMstr instance by example");
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
		log.debug("finding BkpmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BkpmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BkpmMstr instances");
		try {
			String queryString = "from BkpmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BkpmMstr merge(BkpmMstr detachedInstance) {
		log.debug("merging BkpmMstr instance");
		try {
			BkpmMstr result = (BkpmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BkpmMstr instance) {
		log.debug("attaching dirty BkpmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BkpmMstr instance) {
		log.debug("attaching clean BkpmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BkpmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BkpmMstrDAO) ctx.getBean("BkpmMstrDAO");
	}
}