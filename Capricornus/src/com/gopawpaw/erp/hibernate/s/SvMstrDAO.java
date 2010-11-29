package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SvMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SvMstr
 * @author MyEclipse Persistence Tools
 */

public class SvMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SvMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SvMstr transientInstance) {
		log.debug("saving SvMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SvMstr persistentInstance) {
		log.debug("deleting SvMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SvMstr findById(com.gopawpaw.erp.hibernate.s.SvMstrId id) {
		log.debug("getting SvMstr instance with id: " + id);
		try {
			SvMstr instance = (SvMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SvMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SvMstr instance) {
		log.debug("finding SvMstr instance by example");
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
		log.debug("finding SvMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SvMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SvMstr instances");
		try {
			String queryString = "from SvMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SvMstr merge(SvMstr detachedInstance) {
		log.debug("merging SvMstr instance");
		try {
			SvMstr result = (SvMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SvMstr instance) {
		log.debug("attaching dirty SvMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SvMstr instance) {
		log.debug("attaching clean SvMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SvMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SvMstrDAO) ctx.getBean("SvMstrDAO");
	}
}