package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SufMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SufMstr
 * @author MyEclipse Persistence Tools
 */

public class SufMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SufMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SufMstr transientInstance) {
		log.debug("saving SufMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SufMstr persistentInstance) {
		log.debug("deleting SufMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SufMstr findById(com.gopawpaw.erp.hibernate.s.SufMstrId id) {
		log.debug("getting SufMstr instance with id: " + id);
		try {
			SufMstr instance = (SufMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SufMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SufMstr instance) {
		log.debug("finding SufMstr instance by example");
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
		log.debug("finding SufMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SufMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SufMstr instances");
		try {
			String queryString = "from SufMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SufMstr merge(SufMstr detachedInstance) {
		log.debug("merging SufMstr instance");
		try {
			SufMstr result = (SufMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SufMstr instance) {
		log.debug("attaching dirty SufMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SufMstr instance) {
		log.debug("attaching clean SufMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SufMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SufMstrDAO) ctx.getBean("SufMstrDAO");
	}
}