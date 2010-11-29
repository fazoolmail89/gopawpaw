package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SoMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SoMstr
 * @author MyEclipse Persistence Tools
 */

public class SoMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SoMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SoMstr transientInstance) {
		log.debug("saving SoMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SoMstr persistentInstance) {
		log.debug("deleting SoMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SoMstr findById(com.gopawpaw.erp.hibernate.s.SoMstrId id) {
		log.debug("getting SoMstr instance with id: " + id);
		try {
			SoMstr instance = (SoMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SoMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SoMstr instance) {
		log.debug("finding SoMstr instance by example");
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
		log.debug("finding SoMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SoMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SoMstr instances");
		try {
			String queryString = "from SoMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SoMstr merge(SoMstr detachedInstance) {
		log.debug("merging SoMstr instance");
		try {
			SoMstr result = (SoMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SoMstr instance) {
		log.debug("attaching dirty SoMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SoMstr instance) {
		log.debug("attaching clean SoMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SoMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SoMstrDAO) ctx.getBean("SoMstrDAO");
	}
}