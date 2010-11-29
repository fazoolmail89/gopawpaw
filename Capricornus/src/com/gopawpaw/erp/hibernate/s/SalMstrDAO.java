package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SalMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SalMstr
 * @author MyEclipse Persistence Tools
 */

public class SalMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SalMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SalMstr transientInstance) {
		log.debug("saving SalMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SalMstr persistentInstance) {
		log.debug("deleting SalMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SalMstr findById(com.gopawpaw.erp.hibernate.s.SalMstrId id) {
		log.debug("getting SalMstr instance with id: " + id);
		try {
			SalMstr instance = (SalMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SalMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SalMstr instance) {
		log.debug("finding SalMstr instance by example");
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
		log.debug("finding SalMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SalMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SalMstr instances");
		try {
			String queryString = "from SalMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SalMstr merge(SalMstr detachedInstance) {
		log.debug("merging SalMstr instance");
		try {
			SalMstr result = (SalMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SalMstr instance) {
		log.debug("attaching dirty SalMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SalMstr instance) {
		log.debug("attaching clean SalMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SalMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SalMstrDAO) ctx.getBean("SalMstrDAO");
	}
}