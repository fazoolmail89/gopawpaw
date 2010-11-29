package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SiMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SiMstr
 * @author MyEclipse Persistence Tools
 */

public class SiMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SiMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SiMstr transientInstance) {
		log.debug("saving SiMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SiMstr persistentInstance) {
		log.debug("deleting SiMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SiMstr findById(com.gopawpaw.erp.hibernate.s.SiMstrId id) {
		log.debug("getting SiMstr instance with id: " + id);
		try {
			SiMstr instance = (SiMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SiMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SiMstr instance) {
		log.debug("finding SiMstr instance by example");
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
		log.debug("finding SiMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SiMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SiMstr instances");
		try {
			String queryString = "from SiMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SiMstr merge(SiMstr detachedInstance) {
		log.debug("merging SiMstr instance");
		try {
			SiMstr result = (SiMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SiMstr instance) {
		log.debug("attaching dirty SiMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SiMstr instance) {
		log.debug("attaching clean SiMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SiMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SiMstrDAO) ctx.getBean("SiMstrDAO");
	}
}