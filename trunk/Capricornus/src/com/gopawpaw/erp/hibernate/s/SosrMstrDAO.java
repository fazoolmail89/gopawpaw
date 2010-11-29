package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SosrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SosrMstr
 * @author MyEclipse Persistence Tools
 */

public class SosrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SosrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SosrMstr transientInstance) {
		log.debug("saving SosrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SosrMstr persistentInstance) {
		log.debug("deleting SosrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SosrMstr findById(com.gopawpaw.erp.hibernate.s.SosrMstrId id) {
		log.debug("getting SosrMstr instance with id: " + id);
		try {
			SosrMstr instance = (SosrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SosrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SosrMstr instance) {
		log.debug("finding SosrMstr instance by example");
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
		log.debug("finding SosrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SosrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SosrMstr instances");
		try {
			String queryString = "from SosrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SosrMstr merge(SosrMstr detachedInstance) {
		log.debug("merging SosrMstr instance");
		try {
			SosrMstr result = (SosrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SosrMstr instance) {
		log.debug("attaching dirty SosrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SosrMstr instance) {
		log.debug("attaching clean SosrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SosrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SosrMstrDAO) ctx.getBean("SosrMstrDAO");
	}
}