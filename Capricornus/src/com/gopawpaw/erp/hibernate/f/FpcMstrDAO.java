package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FpcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FpcMstr
 * @author MyEclipse Persistence Tools
 */

public class FpcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FpcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FpcMstr transientInstance) {
		log.debug("saving FpcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FpcMstr persistentInstance) {
		log.debug("deleting FpcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FpcMstr findById(com.gopawpaw.erp.hibernate.f.FpcMstrId id) {
		log.debug("getting FpcMstr instance with id: " + id);
		try {
			FpcMstr instance = (FpcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FpcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FpcMstr instance) {
		log.debug("finding FpcMstr instance by example");
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
		log.debug("finding FpcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FpcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FpcMstr instances");
		try {
			String queryString = "from FpcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FpcMstr merge(FpcMstr detachedInstance) {
		log.debug("merging FpcMstr instance");
		try {
			FpcMstr result = (FpcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FpcMstr instance) {
		log.debug("attaching dirty FpcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FpcMstr instance) {
		log.debug("attaching clean FpcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FpcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FpcMstrDAO) ctx.getBean("FpcMstrDAO");
	}
}